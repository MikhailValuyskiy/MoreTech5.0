package com.androidheroes.moretechhack.ui.common

import android.content.Context
import android.text.Editable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.FrameLayout
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.widget.addTextChangedListener
import com.androidheroes.moretechhack.R

class SearchBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {

    var editText: EditText
    var search_edit_text: EditText
    var filter_text_button: AppCompatImageView

    private var hint: String = ""
    private var isCancelVisible: Boolean = true

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.search_toolbar, this)
        editText = view.findViewById(R.id.search_edit_text)
        search_edit_text = view.findViewById(R.id.search_edit_text)
        filter_text_button = view.findViewById(R.id.filter_button)

        if (attrs != null) {
            context.obtainStyledAttributes(attrs, R.styleable.SearchBar).apply {
                hint = getString(R.styleable.SearchBar_hint).orEmpty()
                isCancelVisible = getBoolean(R.styleable.SearchBar_cancel_visible, true)
                recycle()
            }
        }
    }

    fun setText(text: String?) {
        this.editText.setText(text)
    }

    fun clear() {
        this.editText.setText("")
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        search_edit_text.hint = hint
        filter_text_button.setOnClickListener {

        }
        filter_text_button.visibility = View.VISIBLE
    }

    fun setFilterClick(click:()->Unit){
        filter_text_button.setOnClickListener {
            click.invoke()
        }
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        search_edit_text.afterTextChanged { text ->

        }
    }
}

fun EditText.afterTextChanged(action: (s: Editable?) -> Unit) =
    addTextChangedListener(afterTextChanged = action)