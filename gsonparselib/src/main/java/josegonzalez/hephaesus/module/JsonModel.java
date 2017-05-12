package josegonzalez.hephaesus.module;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**.___
 * Created by Jose Gonzalez
 __.*/
public abstract class JsonModel {

    protected Context context;

    protected long id;
    protected String name;

    protected JsonModel(Context context){
        this.context = context;
    }

    public String getItemName(){
        return name;
    }

    public long getItemId(){
        return id;
    }

    public List<JsonModel> JsonToModelParser(String jsonURL) {
        Gson gson = new Gson();
        String json = null;

        try {
            json = getJson(jsonURL);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Type listType = new TypeToken<ArrayList<JsonModel>>(){}.getType(); //Change JsonModel class for the child one
        return gson.fromJson(json, listType);
    }

    protected String getJson(String JsonURL) throws IOException {
        String json = null;
        try {
            //InputStream is = FaceCreatorApplication.getContext().getAssets().open("sampleScreenButtons.json");
            InputStream is = context.getAssets().open(JsonURL);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return json;
    }

}
//.___ End of JsonModel __./
