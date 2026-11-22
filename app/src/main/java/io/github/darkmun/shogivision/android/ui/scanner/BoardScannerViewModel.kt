package io.github.darkmun.shogivision.android.ui.scanner

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class BoardScannerViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(BoardScannerUiState())
    val uiState: StateFlow<BoardScannerUiState> = _uiState.asStateFlow()
}