import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;


public class SaveSharedPreference {

	public static final String USER_NAME_KEY = "username";
	public static final String USER_PASS_KEY = "password";
	public static final String USER_NAME = "name";
	
	static SharedPreferences getSharedPreferences(Context ctx){
		return PreferenceManager.getDefaultSharedPreferences(ctx);
	}
	
	public static void setData(Context ctx, String KEY, String userName){
		Editor editor = getSharedPreferences(ctx).edit();
		editor.putString(KEY, userName);
		editor.commit();
	}

	public static String getData(Context ctx, String KEY){
		return getSharedPreferences(ctx).getString(KEY, "");
	}
	
	
}