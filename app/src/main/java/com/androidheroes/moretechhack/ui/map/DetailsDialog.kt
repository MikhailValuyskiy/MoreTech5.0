package com.androidheroes.moretechhack.ui.map

import android.content.Context
import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.TextView
import com.androidheroes.moretechhack.R
import com.androidheroes.moretechhack.data.BankInfo
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar


class ConfirmationDialog(
    private val bankAddress: BankInfo,
    context: Context
) :
    BottomSheetDialog(context, R.style.TransparentBottomSheet) {

    override fun onCreate(savedInstanceState: Bundle?) {
        val contentView = View.inflate(context, R.layout.dialog_details, null)
        setContentView(contentView)
        super.onCreate(savedInstanceState)

        contentView.rootView.findViewById<TextView>(R.id.tv_bottom_sheet_heading).text = bankAddress.title

        contentView.rootView.findViewById<TextView>(R.id.bank_address).text =  Html.fromHtml("Адрес: <b>${bankAddress.address}</b>")
        contentView.rootView.findViewById<TextView>(R.id. bank_time).text =  Html.fromHtml("Режим работы: <b>${bankAddress.time}</b>")
        contentView.rootView.findViewById<TextView>(R.id. bank_phone).text = Html.fromHtml("Телефон: <b>${bankAddress.phone}</b>")

        contentView.rootView.findViewById<TextView>(R.id.services).text ="Услуги: ${bankAddress.services.joinToString { it }}"

        contentView.rootView.findViewById<TextView>(R.id. bank_availability).text = Html.fromHtml("Загрузка: <b>${bankAddress.getAvailability(12).title}</b>")

        contentView.rootView.findViewById<MaterialButton>(R.id. que).setOnClickListener {
            ApplyDialog.newInstance(bankAddress, context)
            this.hide()
        }

    }

    override fun onStart() {
        super.onStart()
    }

    companion object {
        fun newInstance(address: BankInfo, context: Context): ConfirmationDialog {
            val dialog = ConfirmationDialog(address, context)
            dialog.show()
            return dialog
        }
    }
}