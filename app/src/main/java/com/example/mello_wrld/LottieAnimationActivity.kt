package com.example.mello_wrld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

class LottiAnimationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myLottie()
        }
    }
}

@Composable
fun myLottie(){
    Column(modifier= Modifier.fillMaxSize()){

        val composition by rememberLottieComposition(spec= LottieCompositionSpec.RawRes(R.raw.animation_llyujc9u))
        val progress by animateLottieCompositionAsState(composition)

        LottieAnimation(composition, progress,
            modifier=Modifier.size(500.dp))

    }

}


@Preview(showBackground = true)
@Composable
fun myLottiepreview(){
    myLottie()
}
