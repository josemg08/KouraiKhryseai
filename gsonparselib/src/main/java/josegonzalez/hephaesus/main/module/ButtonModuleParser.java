package josegonzalez.hephaesus.main.module;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import josegonzalez.hephaesus.main.JsonModel;
import utils.JsonUtils;

/**.___
 * Created by Jose Gonzalez on 12/05/17
 __.*/
public class ButtonModuleParser {

    private JsonUtils jsonUtils;

    public List<JsonModel> JsonToModelParser(String jsonURL, Context context) {
        Gson gson = new Gson();
        String json = null;

        try {
            jsonUtils = new JsonUtils();
            json = jsonUtils.getJsonFromFile(jsonURL, context);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Type listType = new TypeToken<ArrayList<ButtonModel>>(){}.getType();
        return gson.fromJson(json, listType);
    }

}
//.___ End of ButtonModuleParser __./