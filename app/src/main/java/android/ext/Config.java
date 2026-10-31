package android.ext;

import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class Config {
    public static volatile int configClient = 4;
    public static volatile int floatFlags = 4;
    public static volatile int floatType = 4;
    public static volatile int historyLimit = 4;
    public static volatile int iconsSize = 4;
    public static volatile boolean vSpace = false;
    public static volatile byte vSpace64;
    public static volatile String vSpaceName;
    public static volatile String vSpacePkg;
    public static volatile boolean vSpaceReal;
    public static volatile int xorKey;

    public static int getIconSize() {
        return getIconSize(iconsSize);
    }

    public static int getIconSize(int i7) {
        return (i7 * 2) + 24;
    }

    public static ImageView setIconSize(ImageView imageView) {
        int dp2px48 = Tools.dp2px48();
        return setIconSize(imageView, dp2px48, dp2px48);
    }

    public static ImageView setIconSize(ImageView imageView, int i7) {
        int dp2px48 = Tools.dp2px48();
        return setIconSize(imageView, dp2px48, dp2px48, i7);
    }

    public static ImageView setIconSize(ImageView imageView, int i7, int i8) {
        return setIconSize(imageView, i7, i8, getIconSize());
    }

    public static ImageView setIconSize(ImageView imageView, int i7, int i8, int i9) {
        imageView.setAdjustViewBounds(false);
        imageView.setMinimumWidth(i7);
        imageView.setMinimumHeight(i8);
        int dp2px = (int) Tools.dp2px(i9);
        int i10 = i7 > dp2px ? (i7 - dp2px) / 2 : 0;
        int i11 = i8 > dp2px ? (i8 - dp2px) / 2 : 0;
        imageView.setPadding(i10, i11, i10, i11);
        try {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } catch (Throwable unused) {
        }
        imageView.invalidate();
        return imageView;
    }

    public static ImageView setIconSizeEx(ImageView imageView, int i7) {
        imageView.setAdjustViewBounds(false);
        imageView.setMinimumWidth(i7);
        imageView.setMinimumHeight(i7);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i7;
            layoutParams.height = i7;
            imageView.setLayoutParams(layoutParams);
        }
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.invalidate();
        return imageView;
    }
}
