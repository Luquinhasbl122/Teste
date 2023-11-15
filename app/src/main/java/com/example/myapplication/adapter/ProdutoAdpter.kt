package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ProdutoItemBinding
import com.example.myapplication.model.Produto

class ProdutoAdpter(private val context: Context,val listaProdutos: MutableList<Produto>):
        RecyclerView.Adapter<ProdutoAdpter.ProdutoViewHolder>() {



    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.imgProduto.setImageResource(listaProdutos[position].img!!)
        holder.precoProduto.text = listaProdutos[position].preco
        holder.descricaoProduto.text = listaProdutos[position].descricao
        holder.frete.text = listaProdutos[position].frete
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = ProdutoItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ProdutoViewHolder(itemLista)
    }

    override fun getItemCount() = listaProdutos.size


    inner class ProdutoViewHolder(binding: ProdutoItemBinding): RecyclerView.ViewHolder(binding.root){
        val imgProduto = binding.img
        val precoProduto = binding.txtPreco
        val descricaoProduto = binding.txtDescricao
        val frete = binding.txtFrete

    }

}