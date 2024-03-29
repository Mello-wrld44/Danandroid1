package com.example.mello_wrld

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mello_wrld.R
import com.example.mello_wrld.imageactivity


class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            cardDemo()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun cardDemo(){
    val mContext= LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
//TopAppBar
        TopAppBar(title = { Text(text = "Homepage", fontWeight = FontWeight.Bold)},
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Magenta),
            navigationIcon = {
                IconButton(onClick =  { mContext.startActivity(Intent(mContext,imageactivity::class.java)) }) {

                    Icon(imageVector = Icons.Filled.ArrowBack,
                        contentDescription ="Arrowback" )
                }
            },

            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Share,
                        contentDescription = "share")

                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Settings,
                        contentDescription = "settings")
                }
            })





        Text(text = "Dashboard",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(start = 100.dp))

        Text(text = "Types of Dogs",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)

        //Row1
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)){
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "Alaskan Malamute",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Genres of Music",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        //Row2
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)){
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "Alaskan Malamute",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Best Swahili Dishes",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        //Row3
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)){
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "Alaskan Malamute",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Destination",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        //Row4
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)){
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "Alaskan Malamute",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Artists",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        //Row5
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)){
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "Alaskan Malamute",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Chefs",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        //Row6
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)){
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "Alaskan Malamute",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        //Button
        Button(onClick = { mContext.startActivity(Intent(mContext,PracticalActivity::class.java)) },
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color.Magenta)) {
            Text(text = "Click Me")
        }
        Button(onClick = { mContext.startActivity(Intent(mContext,MainActivity::class.java)) },
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color.Magenta)) {
            Text(text = "Click Me")
        }


    }

}


@Preview(showBackground = true)
@Composable
fun cardDemoPreview(){
    cardDemo()
}
