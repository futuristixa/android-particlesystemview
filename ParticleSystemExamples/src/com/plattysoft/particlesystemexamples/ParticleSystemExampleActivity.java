package com.plattysoft.particlesystemexamples;

import com.plattysoft.particlesystemview.ParticleSystem;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;

public class ParticleSystemExampleActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_particle_system_example);
		findViewById(R.id.button1).setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// Launch 2 particle systems one for each image
		Drawable d = getResources().getDrawable(R.drawable.star_white);
		ParticleSystem ps = new ParticleSystem(this, 80, ((BitmapDrawable) d).getBitmap());
		ps.setScaleRange(0.7f, 1.3f);
		ps.setSpeedRange(0.2f, 0.5f);
		ps.setRotationSpeed(90, 180);
		ps.setVelocity(0.0002f, 90);
		ps.oneShot(arg0, 80, 800);

		d = getResources().getDrawable(R.drawable.star_pink);
		ps = new ParticleSystem(this, 80, ((BitmapDrawable) d).getBitmap());
		ps.setScaleRange(0.7f, 1.3f);
		ps.setSpeedRange(0.2f, 0.5f);
		ps.setRotationSpeed(-90, -180);
		ps.setVelocity(0.0002f, 90);
		ps.oneShot(arg0, 80, 800);
	}

}
