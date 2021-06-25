# Bottom Dialogs for Android (Archived)

## For bottom-dialogs check [material-elements](https://github.com/zeoflow/material-elements)

## Intro
An Android Library that shows on the bottom of the screen a fully
customisable dialog.

## Getting Started
For information on how to get started with Password Strength,
take a look at our [Getting Started](docs/getting-started.md) guide.

## Submitting Bugs or Feature Requests
Bugs or feature requests should be submitted at our [GitHub Issues section](https://github.com/zeoflow/bottom-dialogs/issues).

## How does it work?
### 1. Depend on our library

Bottom Dialogs for Android is available through Google's Maven Repository.
To use it:

1.  Open the `build.gradle` file for your application.
2.  Make sure that the `repositories` section includes Google's Maven Repository
    `google()`. For example:

    ```groovy
      allprojects {
        repositories {
          google()
          jcenter()
        }
      }
    ```

3.  Add the library to the `dependencies` section:

    ```groovy
      dependencies {
        // ...
        implementation 'com.zeoflow:bottom-dialogs:<version>'
        // ...
      }
    ```

### 2. Activity/Fragment Class
`MainActivity.java`

## Usage
### Basic Bottom Dialog

A basic bottom dialog will be shown. You have access to methods such as `setTitle()`, `setContent()`, `setIcon()`, `setCancelable()`, `dismiss()`, etc. Customizations are explained below.

```java
public class MainActivity extends BindAppActivity<ActivityMainBinding, MainViewBinding>
{
    //..
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        //..
        new BottomDialog.Builder(this)
            .setTitle("Awesome!")
            .setContent("What can we improve? Your feedback is always welcome.")
            .show();
        //..
    }
    //..
}
```


### Displaying an icon
The bottom dialog icon will be shown to the left of the title.

```Java
public class MainActivity extends BindAppActivity<ActivityMainBinding, MainViewBinding>
{
    //..
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        //..
        new BottomDialog.Builder(this)
            .setTitle("Awesome!")
            .setContent("What can we improve? Your feedback is always welcome.")
            .setIcon(R.drawable.ic_launcher)
            //.setIcon(ContextCompat.getDrawable(this, R.drawable.ic_launcher))
            .show();
        //..
    }
    //..
}
```

### Adding buttons and callbacks
Buttons are showed at the end of the bottom dialog. You can add your own text, colors and actions/callbacks.

```Java
public class MainActivity extends BindAppActivity<ActivityMainBinding, MainViewBinding>
{
    //..
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        //..
        new BottomDialog.Builder(this)
            .setTitle("Awesome!")
            .setContent("What can we improve? Your feedback is always welcome.")
            .setPositiveText("OK")
            .setPositiveBackgroundColorResource(R.color.colorPrimary)
            //.setPositiveBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary)
            .setPositiveTextColorResource(android.R.color.white)
            //.setPositiveTextColor(ContextCompat.getColor(this, android.R.color.colorPrimary)
            .onPositive(new BottomDialog.ButtonCallback() {
                @Override
                public void onClick(BottomDialog dialog) {
                    Log.d("BottomDialogs", "Do something!");
                }
            }).show();
        //..
    }
    //..
}
```

### Adding a custom view
You can add custom view to your bottom dialog just by adding the layout to the `setCustomView()` method.

```Java
public class MainActivity extends BindAppActivity<ActivityMainBinding, MainViewBinding>
{
    //..
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        //..
        new BottomDialog.Builder(this)
            .setTitle("Awesome!")
            .setContent("What can we improve? Your feedback is always welcome.")
            .setCustomView(R.layout.my_custom_view)
            .show();
        //..
    }
    //..
}
```

## License
    Copyright 2020 ZeoFlow
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
      http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

## 🏆 Contributors 🏆

<!-- ZEOBOT-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<p float="left">
<a href="docs/contributors.md#pushpin-teodor-g-teodorhmx1"><img width="100" src="https://avatars0.githubusercontent.com/u/22307006?v=4" hspace=5 title='Teodor G. (@TeodorHMX1) - click for details about the contributions'></a><a href="docs/contributors.md#pushpin-teogor-teogor"><img width="100" src="https://avatars2.githubusercontent.com/u/70129978?v=4" hspace=5 title='Teogor (@teogor) - click for details about the contributions'></a>
</p>

<!-- markdownlint-enable -->
<!-- prettier-ignore-end -->
<!-- ZEOBOT-LIST:END -->
<!-- ZEOBOT-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<!-- markdownlint-enable -->
<!-- prettier-ignore-end -->
<!-- ZEOBOT-LIST:END -->
