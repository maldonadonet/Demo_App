package cursodb.maldonadonet.com.demo_app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.johnpersano.supertoasts.library.Style;
import com.github.johnpersano.supertoasts.library.SuperActivityToast;
import com.github.johnpersano.supertoasts.library.utils.PaletteUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Super Toast
        mostrarToast();

    }

    public void mostrarToast(){
        SuperActivityToast.create(this, new Style(), Style.TYPE_BUTTON)
                .setButtonText("Login")
                //.setButtonIconResource(R.drawable.ic_undo)
                .setOnButtonClickListener("good_tag_name", null, null)
                .setProgressBarColor(Color.WHITE)
                .setText("Iniciar sesion en la App")
                .setDuration(Style.DURATION_VERY_LONG)
                .setFrame(Style.FRAME_KITKAT)
                .setColor(PaletteUtils.getSolidColor(PaletteUtils.MATERIAL_BLUE))
                .setAnimations(Style.ANIMATIONS_SCALE).show();
    }

}
