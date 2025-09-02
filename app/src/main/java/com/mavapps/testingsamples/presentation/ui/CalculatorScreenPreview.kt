package com.mavapps.testingsamples.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.mavapps.testingsamples.data.fake.FakeCalculatorRepository
import com.mavapps.testingsamples.presentation.viewmodel.CalculatorViewModel

@Composable
fun CalculatorScreen(viewModel: CalculatorViewModel = hiltViewModel()) {
    val result by viewModel.result.collectAsState()

    Column {
        Text("Result: $result")

        Button(onClick = { viewModel.add(2, 3) }) { Text("Add 2 + 3") }
        Button(onClick = { viewModel.subtract(5, 2) }) { Text("Subtract 5 - 2") }
        Button(onClick = { viewModel.multiply(4, 3) }) { Text("Multiply 4 * 3") }
    }
}


@Preview
@Composable
fun CalculatorScreenPreview() {
   // val viewModel = CalculatorViewModel(FakeCalculatorRepository())
   // CalculatorScreen(viewModel)
}
