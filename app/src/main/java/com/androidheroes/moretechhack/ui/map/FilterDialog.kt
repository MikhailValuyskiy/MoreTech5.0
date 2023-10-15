package com.androidheroes.moretechhack.ui.map

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import com.androidheroes.moretechhack.R
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar

class FilterDialog(
    context: Context,
    val onClick: (f: String) -> Unit
) :
    BottomSheetDialog(context, R.style.TransparentBottomSheet) {


    override fun onCreate(savedInstanceState: Bundle?) {
        val contentView = View.inflate(context, R.layout.filter_dialog, null)
        setContentView(contentView)
        super.onCreate(savedInstanceState)

        contentView.rootView.findViewById<TextView>(R.id.tv_bottom_sheet_heading).text = "Фильтр"

        contentView.rootView.findViewById<CheckBox>(R.id.mortgage)
            .setOnCheckedChangeListener { compoundButton, b ->
                onClick(compoundButton!!.text.toString())
            }

        contentView.rootView.findViewById<CheckBox>(R.id.auto_credits)
            .setOnCheckedChangeListener { compoundButton, b ->
                onClick(compoundButton!!.text.toString())
            }
        contentView.rootView.findViewById<CheckBox>(R.id.credits)
            .setOnCheckedChangeListener { compoundButton, b ->
                onClick(compoundButton!!.text.toString())
            }
        contentView.rootView.findViewById<CheckBox>(R.id.payments)
            .setOnCheckedChangeListener { compoundButton, b ->
                onClick(compoundButton!!.text.toString())
            }
        contentView.rootView.findViewById<CheckBox>(R.id.invest)
            .setOnCheckedChangeListener { compoundButton, b ->
                onClick(compoundButton!!.text.toString())
            }

        contentView.rootView.findViewById<CheckBox>(R.id.near)
            .setOnCheckedChangeListener { compoundButton, b ->
                onClick(compoundButton!!.text.toString())
            }


        contentView.rootView.findViewById<MaterialButton>(R.id.confirm_button).setOnClickListener {
            hide()
            Snackbar.make(contentView.rootView, "Фильтр применен!", Snackbar.LENGTH_LONG).show()
        }


    }

    override fun onStart() {
        super.onStart()
    }

    companion object {
        fun newInstance(context: Context, onClick: (f: String) -> Unit): FilterDialog {
            val dialog = FilterDialog(context, onClick)
            dialog.show()
            return dialog
        }
    }
}