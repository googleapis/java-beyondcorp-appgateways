// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/beyondcorp/appgateways/v1/app_gateways_service.proto

package com.google.cloud.beyondcorp.appgateways.v1;

public final class AppGatewaysServiceProto {
  private AppGatewaysServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_beyondcorp_appgateways_v1_GetAppGatewayRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_GetAppGatewayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_beyondcorp_appgateways_v1_CreateAppGatewayRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_CreateAppGatewayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_beyondcorp_appgateways_v1_DeleteAppGatewayRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_DeleteAppGatewayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_AllocatedConnection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_AllocatedConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGatewayOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appgateways_v1_AppGatewayOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/cloud/beyondcorp/appgateways/v1" +
      "/app_gateways_service.proto\022&google.clou" +
      "d.beyondcorp.appgateways.v1\032\034google/api/" +
      "annotations.proto\032\027google/api/client.pro" +
      "to\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\032#google/longrunni" +
      "ng/operations.proto\032\037google/protobuf/tim" +
      "estamp.proto\"\263\001\n\026ListAppGatewaysRequest\022" +
      "<\n\006parent\030\001 \001(\tB,\340A\002\372A&\022$beyondcorp.goog" +
      "leapis.com/AppGateway\022\026\n\tpage_size\030\002 \001(\005" +
      "B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\022\023\n\006filter" +
      "\030\004 \001(\tB\003\340A\001\022\025\n\010order_by\030\005 \001(\tB\003\340A\001\"\221\001\n\027L" +
      "istAppGatewaysResponse\022H\n\014app_gateways\030\001" +
      " \003(\01322.google.cloud.beyondcorp.appgatewa" +
      "ys.v1.AppGateway\022\027\n\017next_page_token\030\002 \001(" +
      "\t\022\023\n\013unreachable\030\003 \003(\t\"R\n\024GetAppGatewayR" +
      "equest\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$beyondcorp" +
      ".googleapis.com/AppGateway\"\367\001\n\027CreateApp" +
      "GatewayRequest\022<\n\006parent\030\001 \001(\tB,\340A\002\372A&\022$" +
      "beyondcorp.googleapis.com/AppGateway\022\033\n\016" +
      "app_gateway_id\030\002 \001(\tB\003\340A\001\022L\n\013app_gateway" +
      "\030\003 \001(\01322.google.cloud.beyondcorp.appgate" +
      "ways.v1.AppGatewayB\003\340A\002\022\027\n\nrequest_id\030\004 " +
      "\001(\tB\003\340A\001\022\032\n\rvalidate_only\030\005 \001(\010B\003\340A\001\"\212\001\n" +
      "\027DeleteAppGatewayRequest\022:\n\004name\030\001 \001(\tB," +
      "\340A\002\372A&\n$beyondcorp.googleapis.com/AppGat" +
      "eway\022\027\n\nrequest_id\030\002 \001(\tB\003\340A\001\022\032\n\rvalidat" +
      "e_only\030\003 \001(\010B\003\340A\001\"\252\010\n\nAppGateway\022\021\n\004name" +
      "\030\001 \001(\tB\003\340A\002\0224\n\013create_time\030\002 \001(\0132\032.googl" +
      "e.protobuf.TimestampB\003\340A\003\0224\n\013update_time" +
      "\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022" +
      "S\n\006labels\030\004 \003(\0132>.google.cloud.beyondcor" +
      "p.appgateways.v1.AppGateway.LabelsEntryB" +
      "\003\340A\001\022\031\n\014display_name\030\005 \001(\tB\003\340A\001\022\020\n\003uid\030\006" +
      " \001(\tB\003\340A\003\022J\n\004type\030\007 \001(\01627.google.cloud.b" +
      "eyondcorp.appgateways.v1.AppGateway.Type" +
      "B\003\340A\002\022L\n\005state\030\010 \001(\01628.google.cloud.beyo" +
      "ndcorp.appgateways.v1.AppGateway.StateB\003" +
      "\340A\003\022\020\n\003uri\030\t \001(\tB\003\340A\003\022j\n\025allocated_conne" +
      "ctions\030\n \003(\0132F.google.cloud.beyondcorp.a" +
      "ppgateways.v1.AppGateway.AllocatedConnec" +
      "tionB\003\340A\003\022S\n\thost_type\030\013 \001(\0162;.google.cl" +
      "oud.beyondcorp.appgateways.v1.AppGateway" +
      ".HostTypeB\003\340A\002\032F\n\023AllocatedConnection\022\024\n" +
      "\007psc_uri\030\001 \001(\tB\003\340A\002\022\031\n\014ingress_port\030\002 \001(" +
      "\005B\003\340A\002\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va" +
      "lue\030\002 \001(\t:\0028\001\"+\n\004Type\022\024\n\020TYPE_UNSPECIFIE" +
      "D\020\000\022\r\n\tTCP_PROXY\020\001\"_\n\005State\022\025\n\021STATE_UNS" +
      "PECIFIED\020\000\022\014\n\010CREATING\020\001\022\013\n\007CREATED\020\002\022\014\n" +
      "\010UPDATING\020\003\022\014\n\010DELETING\020\004\022\010\n\004DOWN\020\005\";\n\010H" +
      "ostType\022\031\n\025HOST_TYPE_UNSPECIFIED\020\000\022\024\n\020GC" +
      "P_REGIONAL_MIG\020\001:l\352Ai\n$beyondcorp.google" +
      "apis.com/AppGateway\022Aprojects/{project}/" +
      "locations/{location}/appGateways/{app_ga" +
      "teway}\"\212\002\n\033AppGatewayOperationMetadata\0224" +
      "\n\013create_time\030\001 \001(\0132\032.google.protobuf.Ti" +
      "mestampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032.google." +
      "protobuf.TimestampB\003\340A\003\022\023\n\006target\030\003 \001(\tB" +
      "\003\340A\003\022\021\n\004verb\030\004 \001(\tB\003\340A\003\022\033\n\016status_messag" +
      "e\030\005 \001(\tB\003\340A\003\022#\n\026requested_cancellation\030\006" +
      " \001(\010B\003\340A\003\022\030\n\013api_version\030\007 \001(\tB\003\340A\0032\366\007\n\022" +
      "AppGatewaysService\022\324\001\n\017ListAppGateways\022>" +
      ".google.cloud.beyondcorp.appgateways.v1." +
      "ListAppGatewaysRequest\032?.google.cloud.be" +
      "yondcorp.appgateways.v1.ListAppGatewaysR" +
      "esponse\"@\202\323\344\223\0021\022//v1/{parent=projects/*/" +
      "locations/*}/appGateways\332A\006parent\022\301\001\n\rGe" +
      "tAppGateway\022<.google.cloud.beyondcorp.ap" +
      "pgateways.v1.GetAppGatewayRequest\0322.goog" +
      "le.cloud.beyondcorp.appgateways.v1.AppGa" +
      "teway\">\202\323\344\223\0021\022//v1/{name=projects/*/loca" +
      "tions/*/appGateways/*}\332A\004name\022\211\002\n\020Create" +
      "AppGateway\022?.google.cloud.beyondcorp.app" +
      "gateways.v1.CreateAppGatewayRequest\032\035.go" +
      "ogle.longrunning.Operation\"\224\001\202\323\344\223\002>\"//v1" +
      "/{parent=projects/*/locations/*}/appGate" +
      "ways:\013app_gateway\332A!parent,app_gateway,a" +
      "pp_gateway_id\312A)\n\nAppGateway\022\033AppGateway" +
      "OperationMetadata\022\351\001\n\020DeleteAppGateway\022?" +
      ".google.cloud.beyondcorp.appgateways.v1." +
      "DeleteAppGatewayRequest\032\035.google.longrun" +
      "ning.Operation\"u\202\323\344\223\0021*//v1/{name=projec" +
      "ts/*/locations/*/appGateways/*}\332A\004name\312A" +
      "4\n\025google.protobuf.Empty\022\033AppGatewayOper" +
      "ationMetadata\032M\312A\031beyondcorp.googleapis." +
      "com\322A.https://www.googleapis.com/auth/cl" +
      "oud-platformB\224\002\n*com.google.cloud.beyond" +
      "corp.appgateways.v1B\027AppGatewaysServiceP" +
      "rotoP\001ZLcloud.google.com/go/beyondcorp/a" +
      "ppgateways/apiv1/appgatewayspb;appgatewa" +
      "yspb\252\002&Google.Cloud.BeyondCorp.AppGatewa" +
      "ys.V1\312\002&Google\\Cloud\\BeyondCorp\\AppGatew" +
      "ays\\V1\352\002*Google::Cloud::BeyondCorp::AppG" +
      "ateways::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_beyondcorp_appgateways_v1_ListAppGatewaysResponse_descriptor,
        new java.lang.String[] { "AppGateways", "NextPageToken", "Unreachable", });
    internal_static_google_cloud_beyondcorp_appgateways_v1_GetAppGatewayRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_beyondcorp_appgateways_v1_GetAppGatewayRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_beyondcorp_appgateways_v1_GetAppGatewayRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_beyondcorp_appgateways_v1_CreateAppGatewayRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_beyondcorp_appgateways_v1_CreateAppGatewayRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_beyondcorp_appgateways_v1_CreateAppGatewayRequest_descriptor,
        new java.lang.String[] { "Parent", "AppGatewayId", "AppGateway", "RequestId", "ValidateOnly", });
    internal_static_google_cloud_beyondcorp_appgateways_v1_DeleteAppGatewayRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_beyondcorp_appgateways_v1_DeleteAppGatewayRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_beyondcorp_appgateways_v1_DeleteAppGatewayRequest_descriptor,
        new java.lang.String[] { "Name", "RequestId", "ValidateOnly", });
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "UpdateTime", "Labels", "DisplayName", "Uid", "Type", "State", "Uri", "AllocatedConnections", "HostType", });
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_AllocatedConnection_descriptor =
      internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_AllocatedConnection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_AllocatedConnection_descriptor,
        new java.lang.String[] { "PscUri", "IngressPort", });
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_LabelsEntry_descriptor =
      internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_beyondcorp_appgateways_v1_AppGateway_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGatewayOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_beyondcorp_appgateways_v1_AppGatewayOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_beyondcorp_appgateways_v1_AppGatewayOperationMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "EndTime", "Target", "Verb", "StatusMessage", "RequestedCancellation", "ApiVersion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
