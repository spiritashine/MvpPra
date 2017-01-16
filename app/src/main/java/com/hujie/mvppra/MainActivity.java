package com.hujie.mvppra;

import android.app.ProgressDialog;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ClassifyConfig.IClassifyView{
    private ProgressDialog dialog;
    private ClassifyConfig.IClassifyPresenter presenter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new ClassifyPresenterImpl(this);

        findViewById(R.id.loadData).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.pullData();
            }
        });

        findViewById(R.id.addData).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.dragData();
            }
        });

        dialog=new ProgressDialog(this);
    }


    @Override
    public void showLoading() {
        dialog.show();
    }

    @Override
    public void hideLoading() {
        dialog.dismiss();
    }

    @Override
    public void fillData(ArrayList<ClassifyBean> data) {
        Toast.makeText(this, ""+data.size(),Toast.LENGTH_LONG).show();
    }
}
