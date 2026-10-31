package p036e2;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.ListFragment;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.webkit.WebViewFragment;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.VideoView;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher;
import androidx.fragment.app.ComponentCallbacksC0361n;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.HashMap;
import java.util.Locale;
import p198z0.C2274b;

/* renamed from: e2.e3 */
/* loaded from: classes.dex */
public final class C0988e3 {

    /* renamed from: b */
    public static final C0988e3 f5039b = new C0988e3();

    /* renamed from: a */
    public final HashMap<String, String> f5040a = new HashMap<>();

    public C0988e3() {
        m3012b();
    }

    /* renamed from: a */
    public final void m3011a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = this.f5040a;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(str, str2.toUpperCase(Locale.ENGLISH));
    }

    /* renamed from: b */
    public final void m3012b() {
        if (this.f5040a.size() != 0) {
            return;
        }
        try {
            m3011a(AutoCompleteTextView.class.getSimpleName(), "A0");
        } catch (Throwable unused) {
        }
        try {
            m3011a(ActionBar.class.getSimpleName(), "A1");
        } catch (Throwable unused2) {
        }
        try {
            m3011a(AlertDialog.class.getSimpleName(), "A2");
        } catch (Throwable unused3) {
        }
        try {
            m3011a(Button.class.getSimpleName(), "B0");
        } catch (Throwable unused4) {
        }
        try {
            m3011a(CheckBox.class.getSimpleName(), "C0");
        } catch (Throwable unused5) {
        }
        try {
            m3011a(CheckedTextView.class.getSimpleName(), "C1");
        } catch (Throwable unused6) {
        }
        try {
            m3011a(Class.forName("com.android.internal.policy.DecorView").getSimpleName(), "D0");
        } catch (Throwable unused7) {
        }
        try {
            m3011a("DrawerLayout", "D1");
        } catch (Throwable unused8) {
        }
        try {
            m3011a(EditText.class.getSimpleName(), "E0");
        } catch (Throwable unused9) {
        }
        try {
            m3011a(ExpandableListView.class.getSimpleName(), "E1");
        } catch (Throwable unused10) {
        }
        try {
            m3011a(FrameLayout.class.getSimpleName(), "F0");
        } catch (Throwable unused11) {
        }
        try {
            m3011a(ComponentCallbacksC0361n.class.getSimpleName(), "F1");
        } catch (Throwable unused12) {
        }
        try {
            m3011a(Gallery.class.getSimpleName(), "G0");
        } catch (Throwable unused13) {
        }
        try {
            m3011a(GridView.class.getSimpleName(), "G1");
        } catch (Throwable unused14) {
        }
        try {
            m3011a(HorizontalScrollView.class.getSimpleName(), "H0");
        } catch (Throwable unused15) {
        }
        try {
            m3011a(ImageButton.class.getSimpleName(), "I0");
        } catch (Throwable unused16) {
        }
        try {
            m3011a(ImageSwitcher.class.getSimpleName(), "I1");
        } catch (Throwable unused17) {
        }
        try {
            m3011a(ImageView.class.getSimpleName(), "I2");
        } catch (Throwable unused18) {
        }
        try {
            m3011a(LinearLayout.class.getSimpleName(), "L0");
        } catch (Throwable unused19) {
        }
        try {
            m3011a(ListView.class.getSimpleName(), "L1");
        } catch (Throwable unused20) {
        }
        try {
            m3011a(ListFragment.class.getSimpleName(), "L2");
        } catch (Throwable unused21) {
        }
        try {
            m3011a(MultiAutoCompleteTextView.class.getSimpleName(), "M0");
        } catch (Throwable unused22) {
        }
        try {
            m3011a("NestedScrollView", "N0");
        } catch (Throwable unused23) {
        }
        try {
            m3011a(ProgressBar.class.getSimpleName(), "P0");
        } catch (Throwable unused24) {
        }
        try {
            m3011a(RadioButton.class.getSimpleName(), "R0");
        } catch (Throwable unused25) {
        }
        try {
            m3011a(RadioGroup.class.getSimpleName(), "R1");
        } catch (Throwable unused26) {
        }
        try {
            m3011a(RatingBar.class.getSimpleName(), "R2");
        } catch (Throwable unused27) {
        }
        try {
            m3011a(RelativeLayout.class.getSimpleName(), "R3");
        } catch (Throwable unused28) {
        }
        try {
            m3011a("RecyclerView", "R4");
        } catch (Throwable unused29) {
        }
        try {
            m3011a(ScrollView.class.getSimpleName(), "S0");
        } catch (Throwable unused30) {
        }
        try {
            m3011a("SearchView", "S1");
        } catch (Throwable unused31) {
        }
        try {
            m3011a(SeekBar.class.getSimpleName(), "S2");
        } catch (Throwable unused32) {
        }
        try {
            m3011a(Spinner.class.getSimpleName(), "S3");
        } catch (Throwable unused33) {
        }
        try {
            m3011a(Switch.class.getSimpleName(), "S4");
        } catch (Throwable unused34) {
        }
        try {
            m3011a(SurfaceView.class.getSimpleName(), "S5");
        } catch (Throwable unused35) {
        }
        try {
            m3011a(SwipeRefreshLayout.class.getSimpleName(), "S6");
        } catch (Throwable unused36) {
        }
        try {
            m3011a(TabHost.class.getSimpleName(), "T0");
        } catch (Throwable unused37) {
        }
        try {
            m3011a(TableLayout.class.getSimpleName(), "T1");
        } catch (Throwable unused38) {
        }
        try {
            m3011a(TableRow.class.getSimpleName(), "T2");
        } catch (Throwable unused39) {
        }
        try {
            m3011a(TabWidget.class.getSimpleName(), "T3");
        } catch (Throwable unused40) {
        }
        try {
            m3011a(TextSwitcher.class.getSimpleName(), "T4");
        } catch (Throwable unused41) {
        }
        try {
            m3011a(TextView.class.getSimpleName(), "T5");
        } catch (Throwable unused42) {
        }
        try {
            m3011a(Toast.class.getSimpleName(), "T6");
        } catch (Throwable unused43) {
        }
        try {
            m3011a(ToggleButton.class.getSimpleName(), "T7");
        } catch (Throwable unused44) {
        }
        try {
            m3011a(TextureView.class.getSimpleName(), "T8");
        } catch (Throwable unused45) {
        }
        try {
            m3011a("Toolbar", "T9");
        } catch (Throwable unused46) {
        }
        try {
            m3011a(View.class.getSimpleName(), "V0");
        } catch (Throwable unused47) {
        }
        try {
            m3011a(ViewGroup.class.getSimpleName(), "V1");
        } catch (Throwable unused48) {
        }
        try {
            m3011a(ViewStub.class.getSimpleName(), "V2");
        } catch (Throwable unused49) {
        }
        try {
            m3011a(VideoView.class.getSimpleName(), "V3");
        } catch (Throwable unused50) {
        }
        try {
            m3011a(ViewSwitcher.class.getSimpleName(), "V4");
        } catch (Throwable unused51) {
        }
        try {
            m3011a(ViewFlipper.class.getSimpleName(), "V5");
        } catch (Throwable unused52) {
        }
        try {
            m3011a(C2274b.class.getSimpleName(), "V6");
        } catch (Throwable unused53) {
        }
        try {
            m3011a(WebView.class.getSimpleName(), "W0");
        } catch (Throwable unused54) {
        }
        try {
            m3011a(WebViewFragment.class.getSimpleName(), "W1");
        } catch (Throwable unused55) {
        }
    }
}
