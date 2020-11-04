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
fun CounterLocalView(globalCount: Int, incrementGlobalCount: () -> Unit) {

    val (localCount, setCount) = remember { mutableStateOf(0) }

    Column(modifier = Modifier.padding()) {
        Spacer(modifier = Modifier.preferredHeight(20.dp))

        Text("Local Count: $localCount", modifier = Modifier.fillMaxWidth())
        Text("Global Count: $globalCount", modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.preferredHeight(20.dp))

        Button(onClick = { setCount(localCount + 1) }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Increment Local")
        }

        Spacer(modifier = Modifier.preferredHeight(20.dp))

        Button(onClick = { incrementGlobalCount() }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Increment Global")
        }
        Spacer(modifier = Modifier.preferredHeight(20.dp))
    }

}