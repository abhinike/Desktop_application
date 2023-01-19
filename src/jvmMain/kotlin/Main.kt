// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Row(modifier = Modifier.fillMaxWidth().height(50.dp), horizontalArrangement = Arrangement.SpaceBetween){
            Text(modifier = Modifier.padding(16.dp), text = "hello Abhishek Sinha")

           Image( painterResource("img.png"), "image")
        }



    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
