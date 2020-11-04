package akw.app2

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CountersView() {

    Column() {
        CounterView()
        CounterView()


    }

}