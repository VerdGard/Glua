package android.ext;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CharSequenceBuilder {
    private final List<CharSequence> array = new ArrayList();

    public CharSequenceBuilder append(CharSequence charSequence) {
        this.array.add(charSequence);
        return this;
    }

    public CharSequenceBuilder appendFormat(String str, CharSequence... charSequenceArr) {
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int indexOf = str.indexOf("%s", i7);
            if (indexOf < 0) {
                this.array.add(str.substring(i7, str.length()));
                return this;
            }
            this.array.add(str.substring(i7, indexOf));
            this.array.add(charSequenceArr[i8]);
            i7 = indexOf + 2;
            i8++;
        }
    }

    public CharSequenceBuilder appendJoin(CharSequence charSequence, CharSequence[] charSequenceArr) {
        int length = charSequenceArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                this.array.add(charSequence);
            }
            this.array.add(charSequenceArr[i7]);
        }
        return this;
    }

    public int size() {
        return this.array.size();
    }

    public CharSequence toCharSequence() {
        List<CharSequence> list = this.array;
        return Tools.concat((CharSequence[]) list.toArray(new CharSequence[list.size()]));
    }
}
