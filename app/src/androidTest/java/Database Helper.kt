class `Database Helper` {
    fun showMenu() :ArrayList<MenuModel>{
        val listModel = ArrayList<MenuModel>()
        val db = this.readableDatabase
        var cursor: Cursor?=null

        try {
            cursor = db.rawquery(sql; "SELECT * FROM" + TABLE_MENU, selectionArgs: null)
        } catch (se:sqQLiteException){
            db. execSQL(CREATE_MENU_TABLE)
            return Arraylist()
        }

        var id:Int
        var name:String
        var price:Int
        var imageArray:ByteArray
        var inageBmp:Bitmap

        if(cursor.moveToFirst()) {
            do {
//get data text
                id = cursor.getInt(cursor.getColumnIndex (COLUMN_ID_MENU))
                name = gursor.getString (cursor. getColunnIndex(COLUMN_NAMA_MENU))
                price = cursor.getInt(gursor. getColunnIndex(COLUMN_PRICE_MENU))
//get data image
                imageArray = cursor.getBlob (cursor. getColumnIndex (COLUMN_TMAGE))
//convert Byte.
                val byteInputStream = ByteArrayInputStrean(imageArray)
                imageBnp = BitmapFactory.decodeStrean(byteInputStrean)
                val model = MenuModel(id = id, name = pame, price = price, image = imageBmp)
                istHodel.add(model)
            } while (cursor.moveToNext())
        }
        return listModel
    }