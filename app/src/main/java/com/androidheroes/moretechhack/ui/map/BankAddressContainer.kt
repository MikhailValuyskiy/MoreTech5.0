package com.androidheroes.moretechhack.ui.map

import android.view.View
import com.androidheroes.moretechhack.R
import com.androidheroes.moretechhack.data.BankInfo
import com.androidheroes.moretechhack.databinding.ItemAddressBinding
import com.xwray.groupie.viewbinding.BindableItem

class BankAddressContainer(
    private val content: BankInfo,
    private val onClick: (a: BankInfo) -> Unit
) : BindableItem<ItemAddressBinding>() {

    override fun bind(viewBinding: ItemAddressBinding, position: Int) {
        viewBinding.title.text = content.title
        viewBinding.address.text = content.address
        viewBinding.phone.text = content.phone
        viewBinding.email.text = content.time
        viewBinding.content.setOnClickListener {
            onClick.invoke(content)
        }

        viewBinding.services.text = "Услуги: ${content.services.joinToString { it }}"
    }

    override fun initializeViewBinding(view: View): ItemAddressBinding {
        return ItemAddressBinding.bind(view)
    }

    override fun getLayout() = R.layout.item_address


}
