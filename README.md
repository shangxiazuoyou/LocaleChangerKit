# LocaleChangerKit
An Android library to programmatically set the Locale of an app and persist the configuration.

### Use
```
LocaleChanger.setLocale(new Locale("en", "US"));
restartApplication();

private void restartApplication() {
        //切换语言信息，需要重启 Activity 才能实现
        UIHelper.showToast(mContext, getString(R.string.the_application_is_about_to_restart));
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
```
