package io.github.darkmun.shogivision.android.ui.scanner

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import io.github.darkmun.shogivision.android.ui.theme.ShogiVisionAndroidTheme

@Composable
fun BoardScannerScreen(
    viewModel: BoardScannerViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    BoardScannerScreen(uiState)
}

@Composable
private fun BoardScannerScreen(
    uiState: BoardScannerUiState
) {
}

@Preview(
    name = "Light Mode",
    showSystemUi = true,
    showBackground = true
)
@Preview(
    name = "Dark Mode",
    showSystemUi = true,
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
fun BoardScannerScreenPreview() {
    ShogiVisionAndroidTheme {
        BoardScannerScreen()
    }
}