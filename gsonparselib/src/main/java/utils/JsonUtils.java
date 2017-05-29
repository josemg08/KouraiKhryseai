package utils;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**___.
 * Created by Jose Gonzalez
 __.*/
public class JsonUtils {

    public String getJsonFromFile(String JsonURL, Context context) throws IOException {
        String json = null;
        try {
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
//.___ End of JsonUtils __./
