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
fun CounterView() {

    val (count, setCount) = remember { mutableStateOf(0) }

    Column(modifier = Modifier.padding()) {
        Spacer(modifier = Modifier.preferredHeight(20.dp))

        Text("Count: $count", modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.preferredHeight(20.dp))

        Button(onClick = { setCount(count + 1) }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Local")
        }

        Spacer(modifier = Modifier.preferredHeight(20.dp))
    }

}