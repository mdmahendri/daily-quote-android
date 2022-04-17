package com.mahendrimd.dailyquote

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mahendrimd.dailyquote.network.Quote
import com.mahendrimd.dailyquote.network.QuoteApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val _quote = MutableLiveData<Quote>()
    val quote: LiveData<Quote> = _quote

    init {
        getRandomQuote()
    }

    fun getRandomQuote() {
        viewModelScope.launch {
            _quote.value = QuoteApi.retrofitService.singleQuote()[0]
        }
    }
}