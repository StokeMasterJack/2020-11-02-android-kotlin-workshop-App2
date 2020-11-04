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
fun CounterGlobalView() {

    val (globalCount, setGlobalCount) = remember { mutableStateOf(0) }

    Column(modifier = Modifier.padding()) {
        
        Text(text = "Global Count: $globalCount")
        
        Spacer(modifier = Modifier.preferredHeight(20.dp))

        CounterLocalView(globalCount = globalCount, incrementGlobalCount = { setGlobalCount(globalCount + 1) })

        Spacer(modifier = Modifier.preferredHeight(20.dp))

        CounterLocalView(globalCount = globalCount, incrementGlobalCount = { setGlobalCount(globalCount + 1) })

        Spacer(modifier = Modifier.preferredHeight(20.dp))
    }

}