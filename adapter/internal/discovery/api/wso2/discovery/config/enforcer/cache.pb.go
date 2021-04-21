// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.13.0
// source: wso2/discovery/config/enforcer/cache.proto

package enforcer

import (
	proto "github.com/golang/protobuf/proto"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

// JWT Generator model
type Cache struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Enable      bool  `protobuf:"varint,1,opt,name=enable,proto3" json:"enable,omitempty"`
	MaximumSize int32 `protobuf:"varint,2,opt,name=maximumSize,proto3" json:"maximumSize,omitempty"`
	ExpiryTime  int32 `protobuf:"zigzag32,3,opt,name=expiryTime,proto3" json:"expiryTime,omitempty"`
}

func (x *Cache) Reset() {
	*x = Cache{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wso2_discovery_config_enforcer_cache_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Cache) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Cache) ProtoMessage() {}

func (x *Cache) ProtoReflect() protoreflect.Message {
	mi := &file_wso2_discovery_config_enforcer_cache_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Cache.ProtoReflect.Descriptor instead.
func (*Cache) Descriptor() ([]byte, []int) {
	return file_wso2_discovery_config_enforcer_cache_proto_rawDescGZIP(), []int{0}
}

func (x *Cache) GetEnable() bool {
	if x != nil {
		return x.Enable
	}
	return false
}

func (x *Cache) GetMaximumSize() int32 {
	if x != nil {
		return x.MaximumSize
	}
	return 0
}

func (x *Cache) GetExpiryTime() int32 {
	if x != nil {
		return x.ExpiryTime
	}
	return 0
}

var File_wso2_discovery_config_enforcer_cache_proto protoreflect.FileDescriptor

var file_wso2_discovery_config_enforcer_cache_proto_rawDesc = []byte{
	0x0a, 0x2a, 0x77, 0x73, 0x6f, 0x32, 0x2f, 0x64, 0x69, 0x73, 0x63, 0x6f, 0x76, 0x65, 0x72, 0x79,
	0x2f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2f, 0x65, 0x6e, 0x66, 0x6f, 0x72, 0x63, 0x65, 0x72,
	0x2f, 0x63, 0x61, 0x63, 0x68, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1e, 0x77, 0x73,
	0x6f, 0x32, 0x2e, 0x64, 0x69, 0x73, 0x63, 0x6f, 0x76, 0x65, 0x72, 0x79, 0x2e, 0x63, 0x6f, 0x6e,
	0x66, 0x69, 0x67, 0x2e, 0x65, 0x6e, 0x66, 0x6f, 0x72, 0x63, 0x65, 0x72, 0x22, 0x61, 0x0a, 0x05,
	0x43, 0x61, 0x63, 0x68, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x65, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x08, 0x52, 0x06, 0x65, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x12, 0x20, 0x0a,
	0x0b, 0x6d, 0x61, 0x78, 0x69, 0x6d, 0x75, 0x6d, 0x53, 0x69, 0x7a, 0x65, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x05, 0x52, 0x0b, 0x6d, 0x61, 0x78, 0x69, 0x6d, 0x75, 0x6d, 0x53, 0x69, 0x7a, 0x65, 0x12,
	0x1e, 0x0a, 0x0a, 0x65, 0x78, 0x70, 0x69, 0x72, 0x79, 0x54, 0x69, 0x6d, 0x65, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x11, 0x52, 0x0a, 0x65, 0x78, 0x70, 0x69, 0x72, 0x79, 0x54, 0x69, 0x6d, 0x65, 0x42,
	0x91, 0x01, 0x0a, 0x31, 0x6f, 0x72, 0x67, 0x2e, 0x77, 0x73, 0x6f, 0x32, 0x2e, 0x63, 0x68, 0x6f,
	0x72, 0x65, 0x6f, 0x2e, 0x63, 0x6f, 0x6e, 0x6e, 0x65, 0x63, 0x74, 0x2e, 0x64, 0x69, 0x73, 0x63,
	0x6f, 0x76, 0x65, 0x72, 0x79, 0x2e, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x65, 0x6e, 0x66,
	0x6f, 0x72, 0x63, 0x65, 0x72, 0x42, 0x0a, 0x43, 0x61, 0x63, 0x68, 0x65, 0x50, 0x72, 0x6f, 0x74,
	0x6f, 0x50, 0x01, 0x5a, 0x4e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f,
	0x65, 0x6e, 0x76, 0x6f, 0x79, 0x70, 0x72, 0x6f, 0x78, 0x79, 0x2f, 0x67, 0x6f, 0x2d, 0x63, 0x6f,
	0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x2d, 0x70, 0x6c, 0x61, 0x6e, 0x65, 0x2f, 0x77, 0x73, 0x6f, 0x32,
	0x2f, 0x64, 0x69, 0x73, 0x63, 0x6f, 0x76, 0x65, 0x72, 0x79, 0x2f, 0x63, 0x6f, 0x6e, 0x66, 0x69,
	0x67, 0x2f, 0x65, 0x6e, 0x66, 0x6f, 0x72, 0x63, 0x65, 0x72, 0x3b, 0x65, 0x6e, 0x66, 0x6f, 0x72,
	0x63, 0x65, 0x72, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_wso2_discovery_config_enforcer_cache_proto_rawDescOnce sync.Once
	file_wso2_discovery_config_enforcer_cache_proto_rawDescData = file_wso2_discovery_config_enforcer_cache_proto_rawDesc
)

func file_wso2_discovery_config_enforcer_cache_proto_rawDescGZIP() []byte {
	file_wso2_discovery_config_enforcer_cache_proto_rawDescOnce.Do(func() {
		file_wso2_discovery_config_enforcer_cache_proto_rawDescData = protoimpl.X.CompressGZIP(file_wso2_discovery_config_enforcer_cache_proto_rawDescData)
	})
	return file_wso2_discovery_config_enforcer_cache_proto_rawDescData
}

var file_wso2_discovery_config_enforcer_cache_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_wso2_discovery_config_enforcer_cache_proto_goTypes = []interface{}{
	(*Cache)(nil), // 0: wso2.discovery.config.enforcer.Cache
}
var file_wso2_discovery_config_enforcer_cache_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_wso2_discovery_config_enforcer_cache_proto_init() }
func file_wso2_discovery_config_enforcer_cache_proto_init() {
	if File_wso2_discovery_config_enforcer_cache_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_wso2_discovery_config_enforcer_cache_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Cache); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_wso2_discovery_config_enforcer_cache_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_wso2_discovery_config_enforcer_cache_proto_goTypes,
		DependencyIndexes: file_wso2_discovery_config_enforcer_cache_proto_depIdxs,
		MessageInfos:      file_wso2_discovery_config_enforcer_cache_proto_msgTypes,
	}.Build()
	File_wso2_discovery_config_enforcer_cache_proto = out.File
	file_wso2_discovery_config_enforcer_cache_proto_rawDesc = nil
	file_wso2_discovery_config_enforcer_cache_proto_goTypes = nil
	file_wso2_discovery_config_enforcer_cache_proto_depIdxs = nil
}
