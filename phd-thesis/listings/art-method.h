class ArtMethod FINAL {
	[...]
	GcRoot<mirror::Class> declaring_class_;
	uint32_t access_flags_;
	uint32_t method_index_;
	[...]
	struct PACKED(4) PtrSizedFields {
	    void* entry_point_from_interpreter_;
	    void* entry_point_from_jni_;
	    void* entry_point_from_quick_compiled_code_;
  	} ptr_sized_fields_;
}