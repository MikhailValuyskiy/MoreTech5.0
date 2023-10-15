package com.androidheroes.moretechhack.ui.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.androidheroes.moretechhack.data.AddressRepository
import com.androidheroes.moretechhack.data.BankInfo
import com.androidheroes.moretechhack.databinding.FragmentAddressesBinding
import com.androidheroes.moretechhack.ui.common.afterTextChanged
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class AddressesFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var _binding: FragmentAddressesBinding? = null
    private val fragmentAddressesBinding get() = _binding!!

    private val adapter by lazy {
        GroupAdapter<GroupieViewHolder>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddressesBinding.inflate(inflater, container, false)
        val view = fragmentAddressesBinding.root
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentAddressesBinding.addressesList.layoutManager = LinearLayoutManager(context)
        fragmentAddressesBinding.addressesList.adapter = adapter.apply { addAll(listOf()) }

        fragmentAddressesBinding.addressSearchToolbar.search_edit_text.afterTextChanged {

            val searchTerm = it.toString()
            if (searchTerm.isNotEmpty()) {
                val searchTerm = it.toString()
                if (it.toString().length > 3) {
                    val result: List<BankInfo> =
                        AddressRepository.getBanks().filter { it.title.contains(searchTerm) || it.address.contains(searchTerm) }
                            .toList()
                    adapter.clear()
                    if (result.isNotEmpty()) {
                        adapter.apply {
                            addAll(result
                                .map {
                                    BankAddressContainer(it) { a ->
                                    }
                                }
                            )
                        }
                    }
                }
            } else {
                adapter.clear()
                getAddresses()
            }
        }

        getAddresses()
    }

    private fun getAddresses() {
        val addreses =

            AddressRepository.getBanks()
                .map {
                    BankAddressContainer(it) { a ->
                    }
                }

        adapter.apply { addAll(addreses) }
    }


    override fun onStop() {
        super.onStop()
        adapter.clear()
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AddressesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}