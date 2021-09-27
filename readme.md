**导入**

   

**使用**
　　　　
　　　　

        // 
        button.setOnClickListener {
           ScreenShotPlugin.getInstance().startMediaRecorder(this,
               object : ScreenShotPlugin.OnScreenShotListener {
                   override fun onFinish(bitmap: Bitmap?) {
                       TODO("Not yet implemented")
                   }

                   override fun onError(code: Int, msg: String?) {
                       TODO("Not yet implemented")
                   }

               })
        }
