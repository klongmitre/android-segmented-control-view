How to add it to your projects
-------------
ASCV can be added to layouts either through the Android layout designer using xml markup, or dynamically via code.

####Add ASCV via XML markup:

        <org.mitre.ascv.AndroidSegmentedControlView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            ascv:ascv_defaultSelection="2"
            ascv:ascv_unselectedTextColor="@color/test_attr_unselected_text_color"
            ascv:ascv_selectedTextColor="@color/test_attr_selected_text_color"
            ascv:ascv_selectedColor="@color/test_attr_selected_color"
            ascv:ascv_unselectedColor="@color/test_attr_unselected_color"
            ascv:ascv_items="@array/three_state_option"/>

####Add ASCV via XML markup:

        AndroidSegmentedControlView ascv = new AndroidSegmentedControlView(this);
        ascv.setColors(Color.parseColor("#0066CC"),Color.parseColor("#FFFFFF"));
        ascv.setItems(new String[]{"Test1", "Test2", "Test3"}, new String[]{"1", "2", "3"});
        ascv.setDefaultSelection(0);
        holder.addView(ascv);

