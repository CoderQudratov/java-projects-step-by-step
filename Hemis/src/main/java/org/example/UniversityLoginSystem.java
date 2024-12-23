package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Scanner;

public class UniversityLoginSystem {
    public static void main(String[] args) {
        try {
            JSONObject data =readJsonFile("university_data.json");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Login: ");
            String login = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (checkLogin(data,login,password)){
                System.out.println("muvafaqiyatli");
            }else {
                System.out.println("login yoki parol xato");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    private static  JSONObject readJsonFile(String filePath) throws  Exception{
        BufferedReader reader= new BufferedReader(
                new InputStreamReader(UniversityLoginSystem.class.getClassLoader().getResourceAsStream(filePath), StandardCharsets.UTF_8)
        );
        System.out.println(reader.toString());
        StringBuilder jsonString =new StringBuilder();
        String line;
        while ((line =reader.readLine())!=null){
            System.out.println(line);
            jsonString.append(line);
        }
        return new JSONObject(jsonString.toString());
    }
    private  static boolean checkLogin(JSONObject data, String login, String password){
        Iterator<String> universities =data.keys();
        while (universities.hasNext()){
            String universityKeys =universities.next();
            JSONArray universitiesData =data.getJSONArray(universityKeys);
            for (int i = 0; i < universitiesData.length(); i++) {
                JSONObject university =universitiesData.getJSONObject(i);
                JSONArray students =university.getJSONArray("students");
                for (int j = 0; j < students.length(); j++) {
                    JSONObject student= students.getJSONObject(j);
                    String storeLogin=student.getString("login");
                    String storePassword =student.getString("password");
                    if (storeLogin.equals(login)&& storePassword.equals(password)){
                        System.out.println("Foydalanuvhi: "+ student.getString("name"));
                        System.out.println("Universiteti: "+university.getString("university"));
                        return  true;
                    }
                }

            }
        }
        return  false;
    }
}