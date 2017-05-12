package josegonzalez.hephaestus.kouraikhryseai.modules;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;

import josegonzalez.hephaesus.module.JsonModel;

/**.___
 * Created by Jose Gonzalez
 __.*/
public class ButtonModule extends JsonModel{

    private int positionX;
    private int positionY;
    private int width;
    private int height;
    private String background;

    public ButtonModule(Context context) {
        super(context);
    }

    public List<JsonModel> JsonToModelParser(String jsonURL) {
        Gson gson = new Gson();
        String json = null;

        try {
            json = getJson(jsonURL);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Type listType = new TypeToken<ArrayList<ButtonModule>>(){}.getType();
        return gson.fromJson(json, listType);
    }

}
//.___ End of ButtonModule __./