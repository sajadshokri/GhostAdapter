-keep class ir.coderz.ghostadapter.BindItem
-keep @ir.coderz.ghostadapter.BindItem public class * { *; }

-keepclassmembers class * extends ir.coderz.ghostadapter.GhostViewHolder {
*;
}

-keepclassmembers class * extends androidx.recyclerview.widget.RecyclerView$ViewHolder {
*;
}