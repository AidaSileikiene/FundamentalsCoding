package objectsToJsonExample;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ObjectsToJsonMain {

    public static void main(String[] args) throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "1");
        jsonObject.put("firstName", "Dainius");
        jsonObject.put("lastName", "Pilypas");
        System.out.println(jsonObject.toJSONString());

        JSONObject dogJson = new JSONObject();
        Dog dog = new Dog("Rexas", "Vokieciu aviganis");
        //Json objektas yra kaip mapas, i ji dedam RAKTA ir REIKSME
        dogJson.put("sunsVardas", dog.getName());
        dogJson.put("sunsVeisle", dog.getBreed());

        FileWriter file = new FileWriter("src/main/resources/dog.json");
        file.write(dogJson.toString());
        file.close();
    }
}