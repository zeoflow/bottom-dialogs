/**
 * Copyright 2020 ZeoFlow SRL
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zeoflow.bottomdialogs.demo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.zeoflow.bottomdialogs.BottomDialog;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new BottomDialog.Builder(this)
            .setTitle("Awesome!")
            .setIcon(ContextCompat.getDrawable(this, R.drawable.ic_github))
            .setContent("Glad to see you like BottomDialogs! If you're up for it, we would really appreciate you reviewing us.")
            .setPositiveText("Google Play")
            .setNegativeText("Close")
            .show();
    }

    public void sample(View view)
    {
        new BottomDialog.Builder(this)
            .setTitle("Awesome!")
            .setIcon(ContextCompat.getDrawable(this, R.drawable.ic_github))
            .setContent("Glad to see you like BottomDialogs! If you're up for it, we would really appreciate you reviewing us.")
            .setPositiveText("Google Play")
            .setNegativeText("Close")
            .show();
    }

    public void sampleCustomView(View view)
    {
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView = inflater.inflate(R.layout.bottomdialog_layout, null);

        new BottomDialog.Builder(this)
            .setTitle("Awesome!")
            .setContent("Glad to see you like BottomDialogs! If you're up for it, we would really appreciate you reviewing us.")
            .setCustomView(customView)
            .setPositiveText("Google Play")
            .setNegativeText("Close")
            .show();
    }

    public void toGithub(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/javiersantos/BottomDialogs")));
    }
}
