class function {
    override fun onCreateViewHolder(parent: View6roup, viewType: Int):
            MakananAdapter . HakananViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(
            R.layout.cardview_makanan,
            parent, attachToRoot: false)

        return MakananViewHolder(cellForRow)
    }
    override fun getItemCount() : Int {
        return list.size
    }

    override fun onBindViewHolder(holder : MakananViewHolder, position: Int){
    holder.bind(list[position])}
}

