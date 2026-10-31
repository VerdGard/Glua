package android.lang;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class ProcessEnvironment {
    static final int MIN_NAME_LENGTH = 0;
    private static final HashMap<Variable, Value> theEnvironment;
    private static final Map<String, String> theUnmodifiableEnvironment;

    public static abstract class ExternalData {
        protected final byte[] bytes;
        protected final String str;

        public ExternalData(String str, byte[] bArr) {
            this.str = str;
            this.bytes = bArr;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ExternalData) && ProcessEnvironment.arrayEquals(getBytes(), ((ExternalData) obj).getBytes());
        }

        public byte[] getBytes() {
            return this.bytes;
        }

        public int hashCode() {
            return ProcessEnvironment.arrayHash(getBytes());
        }

        public String toString() {
            return this.str;
        }
    }

    public static class StringEntry implements Map.Entry<String, String> {

        /* renamed from: e */
        public static Map.Entry<Variable, Value> f162e;

        public StringEntry(Map.Entry<Variable, Value> entry) {
            f162e = entry;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof StringEntry) {
                Map.Entry<Variable, Value> entry = f162e;
                if (entry.equals(entry)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public String getKey() {
            return f162e.getKey().toString();
        }

        @Override // java.util.Map.Entry
        public String getValue() {
            return f162e.getValue().toString();
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return f162e.hashCode();
        }

        @Override // java.util.Map.Entry
        public String setValue(String str) {
            return f162e.setValue(Value.valueOf(str)).toString();
        }

        public String toString() {
            return String.valueOf(getKey()) + '=' + getValue();
        }
    }

    public static class StringEntrySet extends AbstractSet<Map.Entry<String, String>> {

        /* renamed from: s */
        private final Set<Map.Entry<Variable, Value>> f163s;

        public StringEntrySet(Set<Map.Entry<Variable, Value>> set) {
            this.f163s = set;
        }

        private static Map.Entry<Variable, Value> vvEntry(final Object obj) {
            return obj instanceof StringEntry ? StringEntry.f162e : new Map.Entry<Variable, Value>() { // from class: android.lang.ProcessEnvironment.StringEntrySet.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.Map.Entry
                public Variable getKey() {
                    return Variable.valueOfQueryOnly(((Map.Entry) obj).getKey());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.Map.Entry
                public Value getValue() {
                    return Value.valueOfQueryOnly(((Map.Entry) obj).getValue());
                }

                @Override // java.util.Map.Entry
                public Value setValue(Value value) {
                    throw new UnsupportedOperationException();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f163s.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f163s.contains(vvEntry(obj));
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return (obj instanceof StringEntrySet) && this.f163s.equals(((StringEntrySet) obj).f163s);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f163s.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f163s.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<String, String>> iterator() {
            return new Iterator<Map.Entry<String, String>>() { // from class: android.lang.ProcessEnvironment.StringEntrySet.1
                @Override // java.util.Iterator
                public boolean hasNext() {
                    return StringEntrySet.this.f163s.iterator().hasNext();
                }

                @Override // java.util.Iterator
                public Map.Entry<String, String> next() {
                    return new StringEntry((Map.Entry) StringEntrySet.this.f163s.iterator().next());
                }

                @Override // java.util.Iterator
                public void remove() {
                    StringEntrySet.this.f163s.iterator().remove();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.f163s.remove(vvEntry(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f163s.size();
        }
    }

    public static class StringEnvironment extends AbstractMap<String, String> {

        /* renamed from: m */
        private Map<Variable, Value> f164m;

        public StringEnvironment(Map<Variable, Value> map) {
            this.f164m = map;
        }

        private static String toString(Value value) {
            if (value == null) {
                return null;
            }
            return value.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f164m.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f164m.containsKey(Variable.valueOfQueryOnly(obj));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.f164m.containsValue(Value.valueOfQueryOnly(obj));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, String>> entrySet() {
            return new StringEntrySet(this.f164m.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public String get(Object obj) {
            return toString(this.f164m.get(Variable.valueOfQueryOnly(obj)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f164m.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<String> keySet() {
            return new StringKeySet(this.f164m.keySet());
        }

        public Object put(String str, Object obj) {
            return put(str, (String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public String put(String str, String str2) {
            return toString(this.f164m.put(Variable.valueOf(str), Value.valueOf(str2)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public String remove(Object obj) {
            return toString(this.f164m.remove(Variable.valueOfQueryOnly(obj)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f164m.size();
        }

        public byte[] toEnvironmentBlock(int[] iArr) {
            int size = this.f164m.size() * 2;
            for (Map.Entry<Variable, Value> entry : this.f164m.entrySet()) {
                size = size + entry.getKey().getBytes().length + entry.getValue().getBytes().length;
            }
            byte[] bArr = new byte[size];
            int i7 = 0;
            for (Map.Entry<Variable, Value> entry2 : this.f164m.entrySet()) {
                byte[] bytes = entry2.getKey().getBytes();
                byte[] bytes2 = entry2.getValue().getBytes();
                System.arraycopy(bytes, 0, bArr, i7, bytes.length);
                int length = i7 + bytes.length;
                int i8 = length + 1;
                bArr[length] = 61;
                System.arraycopy(bytes2, 0, bArr, i8, bytes2.length);
                i7 = i8 + bytes2.length + 1;
            }
            iArr[0] = this.f164m.size();
            return bArr;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<String> values() {
            return new StringValues(this.f164m.values());
        }
    }

    public static class StringKeySet extends AbstractSet {

        /* renamed from: s */
        private final Set f165s;

        public StringKeySet(Set set) {
            this.f165s = set;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f165s.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f165s.contains(Variable.valueOfQueryOnly(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f165s.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new Iterator() { // from class: android.lang.ProcessEnvironment.StringKeySet.1
                @Override // java.util.Iterator
                public boolean hasNext() {
                    return StringKeySet.this.f165s.iterator().hasNext();
                }

                @Override // java.util.Iterator
                public String next() {
                    return StringKeySet.this.f165s.iterator().next().toString();
                }

                @Override // java.util.Iterator
                public void remove() {
                    StringKeySet.this.f165s.iterator().remove();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.f165s.remove(Variable.valueOfQueryOnly(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f165s.size();
        }
    }

    public static class StringValues extends AbstractCollection {

        /* renamed from: c */
        private final Collection f166c;

        public StringValues(Collection collection) {
            this.f166c = collection;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f166c.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f166c.contains(Value.valueOfQueryOnly(obj));
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            return (obj instanceof StringValues) && this.f166c.equals(((StringValues) obj).f166c);
        }

        @Override // java.util.Collection
        public int hashCode() {
            return this.f166c.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f166c.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new Iterator() { // from class: android.lang.ProcessEnvironment.StringValues.1
                @Override // java.util.Iterator
                public boolean hasNext() {
                    return StringValues.this.f166c.iterator().hasNext();
                }

                @Override // java.util.Iterator
                public String next() {
                    return ((Value) StringValues.this.f166c.iterator().next()).toString();
                }

                @Override // java.util.Iterator
                public void remove() {
                    StringValues.this.f166c.iterator().remove();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return this.f166c.remove(Value.valueOfQueryOnly(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f166c.size();
        }
    }

    public static class Value extends ExternalData implements Comparable<Value> {
        public Value(String str, byte[] bArr) {
            super(str, bArr);
        }

        public static Value valueOf(String str) {
            ProcessEnvironment.validateValue(str);
            return valueOfQueryOnly(str);
        }

        public static Value valueOf(byte[] bArr) {
            return new Value(new String(bArr), bArr);
        }

        public static Value valueOfQueryOnly(Object obj) {
            return valueOfQueryOnly((String) obj);
        }

        public static Value valueOfQueryOnly(String str) {
            return new Value(str, str.getBytes());
        }

        @Override // java.lang.Comparable
        public int compareTo(Value value) {
            return ProcessEnvironment.arrayCompare(getBytes(), value.getBytes());
        }

        @Override // android.lang.ProcessEnvironment.ExternalData
        public boolean equals(Object obj) {
            return (obj instanceof Value) && super.equals(obj);
        }
    }

    public static class Variable extends ExternalData implements Comparable<Variable> {
        public Variable(String str, byte[] bArr) {
            super(str, bArr);
        }

        public static Variable valueOf(String str) {
            ProcessEnvironment.validateVariable(str);
            return valueOfQueryOnly(str);
        }

        public static Variable valueOf(byte[] bArr) {
            return new Variable(new String(bArr), bArr);
        }

        public static Variable valueOfQueryOnly(Object obj) {
            return valueOfQueryOnly((String) obj);
        }

        public static Variable valueOfQueryOnly(String str) {
            return new Variable(str, str.getBytes());
        }

        @Override // java.lang.Comparable
        public int compareTo(Variable variable) {
            return ProcessEnvironment.arrayCompare(getBytes(), variable.getBytes());
        }

        @Override // android.lang.ProcessEnvironment.ExternalData
        public boolean equals(Object obj) {
            return (obj instanceof Variable) && super.equals(obj);
        }
    }

    static {
        byte[][] environ = environ();
        theEnvironment = new HashMap<>((environ.length / 2) + 3);
        for (int length = environ.length - 1; length > 0; length -= 2) {
            theEnvironment.put(Variable.valueOf(environ[length - 1]), Value.valueOf(environ[length]));
        }
        theUnmodifiableEnvironment = Collections.unmodifiableMap(new StringEnvironment(theEnvironment));
    }

    private ProcessEnvironment() {
    }

    public static int arrayCompare(byte[] bArr, byte[] bArr2) {
        int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
        for (int i7 = 0; i7 < length; i7++) {
            byte b7 = bArr[i7];
            byte b8 = bArr2[i7];
            if (b7 != b8) {
                return b7 - b8;
            }
        }
        return bArr.length - bArr2.length;
    }

    public static boolean arrayEquals(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < bArr.length; i7++) {
            if (bArr[i7] != bArr2[i7]) {
                return false;
            }
        }
        return true;
    }

    public static int arrayHash(byte[] bArr) {
        int i7 = 0;
        for (byte b7 : bArr) {
            i7 = (i7 * 31) + b7;
        }
        return i7;
    }

    public static Map<String, String> emptyEnvironment(int i7) {
        return new StringEnvironment(new HashMap(i7));
    }

    private static native byte[][] environ();

    public static Map<String, String> environment() {
        return new StringEnvironment((Map) theEnvironment.clone());
    }

    public static String getenv(String str) {
        return theUnmodifiableEnvironment.get(str);
    }

    public static Map<String, String> getenv() {
        return theUnmodifiableEnvironment;
    }

    public static byte[] toEnvironmentBlock(Map<String, String> map, int[] iArr) {
        if (map == null) {
            return null;
        }
        return ((StringEnvironment) map).toEnvironmentBlock(iArr);
    }

    public static void validateValue(String str) {
        if (str.indexOf(0) == -1) {
            return;
        }
        throw new IllegalArgumentException("Invalid environment variable value: \"" + str + '\"');
    }

    public static void validateVariable(String str) {
        if (str.indexOf(61) == -1 && str.indexOf(0) == -1) {
            return;
        }
        throw new IllegalArgumentException("Invalid environment variable name: \"" + str + '\"');
    }
}
