package com.example.networky.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.networky.Adapters.GroupeAdapter
import com.example.networky.Adapters.ThemeAdapter
import com.example.networky.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GroupesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GroupesFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val arrayofimg = arrayListOf<Int>()

        arrayofimg.add(R.drawable.groupe0)
        arrayofimg.add(R.drawable.groupe1)
        arrayofimg.add(R.drawable.groupe2)
        arrayofimg.add(R.drawable.groupe3)
        arrayofimg.add(R.drawable.groupe4)

        val view =  inflater.inflate(R.layout.fragment_groupes, container, false)

        val rv = view.findViewById<RecyclerView>(R.id.groupes_recyclerview)

        rv.adapter = GroupeAdapter(arrayofimg,requireActivity())

        rv.layoutManager = LinearLayoutManager(requireContext())
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GroupesFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GroupesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}