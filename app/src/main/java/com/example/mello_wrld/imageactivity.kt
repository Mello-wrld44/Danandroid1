package com.example.mello_wrld

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mello_wrld.ScrollActivity

class imageactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myimage()



        }
    }
}

@Composable
fun myimage(){

    val mContext= LocalContext.current

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(start = 20.dp)){
     Text(text = "Breeds of Dogs",
        fontSize = 30.sp,
        color = Color.Black,
        fontFamily = FontFamily.Cursive,
        modifier = Modifier.padding(start = 50.dp),
        fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(20.dp))

        //first row
        Row {
            Image(painter = painterResource(id = R.drawable.img),
                contentDescription ="Golden Retriever",
                modifier = Modifier.size(width = 200.dp, height = 150.dp))

            Column{
            Text(text="Golden retriever",
                 fontSize = 20.sp,
            )
                Text(text = "The dog is a domestic animal")
            }

        }

        Spacer(modifier = Modifier.height(20.dp))
        //Second row
        Row {
            Image(painter = painterResource(id = R.drawable.img_1),
                contentDescription ="Golden Retriever",
                modifier = Modifier.size(width = 200.dp, height = 150.dp))

            Column{
                Text(text="German Shepherd",
                    fontSize = 20.sp,
                )
                Text(text = "The dog is a domestic animal")
            }

        }

        Spacer(modifier = Modifier.height(20.dp))
        //Third row
        Row {
            Image(painter = painterResource(id = R.drawable.img_2),
                contentDescription ="Golden Retriever",
                modifier = Modifier.size(width = 200.dp, height = 150.dp))

            Column{
                Text(text="Mixed breed",
                    fontSize = 20.sp,
                )
                Text(text = "The dog is a domestic animal")
            }

        }

        Spacer(modifier = Modifier.height(20.dp))
        //Circular image
        Image(painter = painterResource(id = R.drawable.img_2),
            contentDescription ="image",
            modifier = Modifier
                .size(width = 150.dp, height = 150.dp)
                .clip(shape = CircleShape),
              contentScale = ContentScale.Crop)
        
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { mContext.startActivity(Intent(mContext, ScrollActivity::class.java))},
               shape = CutCornerShape(5.dp),
               modifier = Modifier.padding(start=150.dp)
        ) {
            Text(text = "Next")
            
        }
        Button(onClick = { mContext.startActivity(Intent(mContext,Formactivity::class.java)) },
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color.Magenta)) {
            Text(text = "Click Me")
        }

}

}


@Preview(showBackground = true)
@Composable
fun myimagePreview(){
    myimage()
}
