// C++ mirror of java.lang.Class
class MANAGED Class FINAL : public Object {

	[...]
	HeapReference<IfTable> iftable_;
	HeapReference<String> name_;
	HeapReference<Class> super_class_;
	HeapReference<PointerArray> vtable_;
	uint32_t access_flags_;
	uint64_t direct_methods_;
	uint64_t virtual_methods_;
	uint32_t num_virtual_methods_;
	[...]
}
