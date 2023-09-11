package com.example.mello_wrld

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mello_wrld.ui.theme.Mello_wrldTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashscreenActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            splash()

            val mContext=LocalContext.current
            val coroutineScope= rememberCoroutineScope()
            coroutineScope.launch(){
                delay(1000)
                mContext.startActivity(Intent(mContext,HomepageActivity::class.java))
            }

        }
    }
}

@Composable
fun splash(){
    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.img_8),
            contentDescription ="",
            modifier = Modifier.size(400.dp))
        Spacer(modifier = Modifier.height(25.dp))

        Text(text = "legrande Hotel",
             fontSize = 40.sp,
              fontWeight = FontWeight.Bold,
             fontFamily = FontFamily.Cursive,
             color = Color.Green)
        //CircularProgressIndicator
        CircularProgressIndicator(
            modifier = Modifier.size(200.dp),
            color = Color.Black,
            strokeWidth = 10.dp
        )
        //LinearProgressIndicator
        LinearProgressIndicator(
            modifier=Modifier.padding(20.dp)
                .height(10.dp),
            color=Color.Green
        )

    }

}
@Preview(showBackground = true)
@Composable
fun splashPreview(){

}