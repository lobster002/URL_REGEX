package sky.com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TAG",String.valueOf(TextUtil.regexCheckUrl("http://lingpai.2144.cn/safe/qrcodeLogin?")));
        Log.e("TAG",String.valueOf(TextUtil.regexCheckUrl("http://lingpai.2144.cn/app/agreement")));
        Log.e("TAG",String.valueOf(TextUtil.regexCheckUrl("http://lingpai.2144.cn")));
        Log.e("TAG",String.valueOf(TextUtil.regexCheckUrl("qrcodeLogin")));
        Log.e("TAG",String.valueOf(TextUtil.regexCheckUrl("https://www.baidu.com/")));
        Log.e("TAG",String.valueOf(TextUtil.regexCheckUrl("http://lingpai.2144.cnqrcodeLogin?")));
        Log.e("TAG",String.valueOf(TextUtil.regexCheckUrl("rcodeLogin?http://lingpai.2144.cnqrcodeLogin?")));
    }
}
