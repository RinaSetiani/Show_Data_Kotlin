class `Inner Makanan` {
    inner class MakananViewHolder(v: View) :RecyclerView.ViewHolder(v) {
        val textId : TextView
        val textNama: Textview
        val textHarga : TextView
        val imageMenu : ImageView

        init {
            textId = v.findViewById(R. id. textIdNakanan)
            textllana = v.findViewById(R.id. textNomaNakanan)
            textHarga = v.findViewById(R.id. textHargaNakanan)
            inageMenu = v.findvViewById(R.id.inageNakanan)

            fun bind(data: MenuModel){
                val id:Int = data.id
                val nama:String = data.name
                val harga:Int = data.price
                val gambar:Bitmap = data.image

                textId.text = id.toString()
                textNama.text = nama
                textHarga.text = harga.toString()
                imageMenu. setInageBitmap (gambar)
            }