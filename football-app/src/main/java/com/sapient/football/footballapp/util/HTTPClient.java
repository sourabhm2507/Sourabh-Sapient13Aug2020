package com.sapient.football.footballapp.util;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import java.util.Iterator;
import java.util.Map;

public class HTTPClient {

    public static String makeHTTPGet(String url, Map<String, String> headers){

        HttpClient httpClient = new HttpClient();

        StringBuilder urlBuilder = new StringBuilder(url);
        urlBuilder.append("/?");
        int responseCode = 0;
        String response = null;
        try{
            if(!headers.isEmpty()){
                Iterator<Map.Entry<String,String>> mapIterator = headers.entrySet().iterator();
                while(mapIterator.hasNext()){
                    Map.Entry<String,String> entry = mapIterator.next();
                    urlBuilder.append(entry.getKey());
                    urlBuilder.append("=");
                    urlBuilder.append(entry.getValue());
                    urlBuilder.append("&");
                }
            }
            urlBuilder.append("APIkey=");
            urlBuilder.append("9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978");
            GetMethod getMethod = new GetMethod(urlBuilder.toString());
            responseCode = httpClient.executeMethod(getMethod);
            response = getMethod.getResponseBodyAsString();
        } catch (Exception e){
            e.printStackTrace();
        }
        return response;
    }
}
