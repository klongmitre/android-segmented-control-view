/*
 * NOTICE
 *
 * This is the copyright work of The MITRE Corporation, and was produced for
 * the U. S. Government under Contract Number DTFAWA-10-C-00080, and is subject
 * to Federal Aviation Administration Acquisition Management System Clause
 * 3.5-13, Rights In Data-General, Alt. III and Alt. IV (Oct. 1996).  No other
 * use other than that granted to the U. S. Government, or to those acting on
 * behalf of the U. S. Government, under that Clause is authorized without the
 * express written permission of The MITRE Corporation. For further information,
 * please contact The MITRE Corporation, Contracts Office,7515 Colshire Drive,
 * McLean, VA  22102-7539, (703) 983-6000.
 *
 * Approved for Public Release; Distribution Unlimited. Case Number 14-4045
 */

package org.mitre.ascv.example;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import org.mitre.ascv.AndroidSegmentedControlView;


public class Example extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        LinearLayout holder = (LinearLayout) findViewById(R.id.ascv_sample_holder);
        try {


            AndroidSegmentedControlView ascv = new AndroidSegmentedControlView(this);
            ascv.setColors(Color.parseColor("#0066CC"),Color.parseColor("#FFFFFF"));
            ascv.setItems(new String[]{"Test1", "Test2", "Test3"}, new String[]{"1", "2", "3"});
            ascv.setDefaultSelection(0);
            holder.addView(ascv);

            AndroidSegmentedControlView ascv2 = new AndroidSegmentedControlView(this);
            ascv2.setColors(Color.parseColor("#D24E4E"),Color.parseColor("#FFFFFF"));
            ascv2.setStretch(true);
            ascv2.setItems(new String[]{"Test4", "Test5", "Test6"}, new String[]{"4", "5", "6"});
            ascv2.setDefaultSelection(2);
            holder.addView(ascv2);

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
