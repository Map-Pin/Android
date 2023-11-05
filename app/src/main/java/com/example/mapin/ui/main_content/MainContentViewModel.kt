package com.example.mapin.ui.main_content

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainContentViewModel : ViewModel() {
    private val _mainContentData = MutableStateFlow<List<ContentData>?>(null)
    val mainContentData: StateFlow<List<ContentData>?> = _mainContentData.asStateFlow()

}