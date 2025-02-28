/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/pipeline_job.proto

package com.google.cloud.aiplatform.v1;

public final class Pipeline {
  private Pipeline() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParametersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParametersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParameterValuesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParameterValuesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTemplateMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTemplateMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJobDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJobDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_PipelineTaskStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_PipelineTaskStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_ArtifactList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_ArtifactList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_InputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_InputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_OutputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_OutputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_ContainerDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_ContainerDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_CustomJobDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_CustomJobDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/aiplatform/v1/pipeline_jo"
          + "b.proto\022\032google.cloud.aiplatform.v1\032\037goo"
          + "gle/api/field_behavior.proto\032\031google/api"
          + "/resource.proto\032)google/cloud/aiplatform"
          + "/v1/artifact.proto\032(google/cloud/aiplatf"
          + "orm/v1/context.proto\0320google/cloud/aipla"
          + "tform/v1/encryption_spec.proto\032*google/c"
          + "loud/aiplatform/v1/execution.proto\0328goog"
          + "le/cloud/aiplatform/v1/pipeline_failure_"
          + "policy.proto\032/google/cloud/aiplatform/v1"
          + "/pipeline_state.proto\032&google/cloud/aipl"
          + "atform/v1/value.proto\032\034google/protobuf/s"
          + "truct.proto\032\037google/protobuf/timestamp.p"
          + "roto\032\027google/rpc/status.proto\"\210\014\n\013Pipeli"
          + "neJob\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\024\n\014display_name"
          + "\030\002 \001(\t\0224\n\013create_time\030\003 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\0223\n\nstart_time\030\004 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\0221\n\010end"
          + "_time\030\005 \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\003\0224\n\013update_time\030\006 \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\022.\n\rpipeline_spec\030\007 \001("
          + "\0132\027.google.protobuf.Struct\022=\n\005state\030\010 \001("
          + "\0162).google.cloud.aiplatform.v1.PipelineS"
          + "tateB\003\340A\003\022F\n\njob_detail\030\t \001(\0132-.google.c"
          + "loud.aiplatform.v1.PipelineJobDetailB\003\340A"
          + "\003\022&\n\005error\030\n \001(\0132\022.google.rpc.StatusB\003\340A"
          + "\003\022C\n\006labels\030\013 \003(\01323.google.cloud.aiplatf"
          + "orm.v1.PipelineJob.LabelsEntry\022M\n\016runtim"
          + "e_config\030\014 \001(\01325.google.cloud.aiplatform"
          + ".v1.PipelineJob.RuntimeConfig\022C\n\017encrypt"
          + "ion_spec\030\020 \001(\0132*.google.cloud.aiplatform"
          + ".v1.EncryptionSpec\022\027\n\017service_account\030\021 "
          + "\001(\t\0224\n\007network\030\022 \001(\tB#\372A \n\036compute.googl"
          + "eapis.com/Network\022\024\n\014template_uri\030\023 \001(\t\022"
          + "T\n\021template_metadata\030\024 \001(\01324.google.clou"
          + "d.aiplatform.v1.PipelineTemplateMetadata"
          + "B\003\340A\003\032\350\003\n\rRuntimeConfig\022]\n\nparameters\030\001 "
          + "\003(\0132E.google.cloud.aiplatform.v1.Pipelin"
          + "eJob.RuntimeConfig.ParametersEntryB\002\030\001\022!"
          + "\n\024gcs_output_directory\030\002 \001(\tB\003\340A\002\022d\n\020par"
          + "ameter_values\030\003 \003(\0132J.google.cloud.aipla"
          + "tform.v1.PipelineJob.RuntimeConfig.Param"
          + "eterValuesEntry\022I\n\016failure_policy\030\004 \001(\0162"
          + "1.google.cloud.aiplatform.v1.PipelineFai"
          + "lurePolicy\032T\n\017ParametersEntry\022\013\n\003key\030\001 \001"
          + "(\t\0220\n\005value\030\002 \001(\0132!.google.cloud.aiplatf"
          + "orm.v1.Value:\0028\001\032N\n\024ParameterValuesEntry"
          + "\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.google.pr"
          + "otobuf.Value:\0028\001\032-\n\013LabelsEntry\022\013\n\003key\030\001"
          + " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:o\352Al\n%aiplatform"
          + ".googleapis.com/PipelineJob\022Cprojects/{p"
          + "roject}/locations/{location}/pipelineJob"
          + "s/{pipeline_job}\"+\n\030PipelineTemplateMeta"
          + "data\022\017\n\007version\030\003 \001(\t\"\352\001\n\021PipelineJobDet"
          + "ail\022B\n\020pipeline_context\030\001 \001(\0132#.google.c"
          + "loud.aiplatform.v1.ContextB\003\340A\003\022F\n\024pipel"
          + "ine_run_context\030\002 \001(\0132#.google.cloud.aip"
          + "latform.v1.ContextB\003\340A\003\022I\n\014task_details\030"
          + "\003 \003(\0132..google.cloud.aiplatform.v1.Pipel"
          + "ineTaskDetailB\003\340A\003\"\235\013\n\022PipelineTaskDetai"
          + "l\022\024\n\007task_id\030\001 \001(\003B\003\340A\003\022\033\n\016parent_task_i"
          + "d\030\014 \001(\003B\003\340A\003\022\026\n\ttask_name\030\002 \001(\tB\003\340A\003\0224\n\013"
          + "create_time\030\003 \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\003\0223\n\nstart_time\030\004 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\0221\n\010end_time\030\005 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\022T\n\017ex"
          + "ecutor_detail\030\006 \001(\01326.google.cloud.aipla"
          + "tform.v1.PipelineTaskExecutorDetailB\003\340A\003"
          + "\022H\n\005state\030\007 \001(\01624.google.cloud.aiplatfor"
          + "m.v1.PipelineTaskDetail.StateB\003\340A\003\022=\n\tex"
          + "ecution\030\010 \001(\0132%.google.cloud.aiplatform."
          + "v1.ExecutionB\003\340A\003\022&\n\005error\030\t \001(\0132\022.googl"
          + "e.rpc.StatusB\003\340A\003\022d\n\024pipeline_task_statu"
          + "s\030\r \003(\0132A.google.cloud.aiplatform.v1.Pip"
          + "elineTaskDetail.PipelineTaskStatusB\003\340A\003\022"
          + "O\n\006inputs\030\n \003(\0132:.google.cloud.aiplatfor"
          + "m.v1.PipelineTaskDetail.InputsEntryB\003\340A\003"
          + "\022Q\n\007outputs\030\013 \003(\0132;.google.cloud.aiplatf"
          + "orm.v1.PipelineTaskDetail.OutputsEntryB\003"
          + "\340A\003\032\274\001\n\022PipelineTaskStatus\0224\n\013update_tim"
          + "e\030\001 \001(\0132\032.google.protobuf.TimestampB\003\340A\003"
          + "\022H\n\005state\030\002 \001(\01624.google.cloud.aiplatfor"
          + "m.v1.PipelineTaskDetail.StateB\003\340A\003\022&\n\005er"
          + "ror\030\003 \001(\0132\022.google.rpc.StatusB\003\340A\003\032L\n\014Ar"
          + "tifactList\022<\n\tartifacts\030\001 \003(\0132$.google.c"
          + "loud.aiplatform.v1.ArtifactB\003\340A\003\032j\n\013Inpu"
          + "tsEntry\022\013\n\003key\030\001 \001(\t\022J\n\005value\030\002 \001(\0132;.go"
          + "ogle.cloud.aiplatform.v1.PipelineTaskDet"
          + "ail.ArtifactList:\0028\001\032k\n\014OutputsEntry\022\013\n\003"
          + "key\030\001 \001(\t\022J\n\005value\030\002 \001(\0132;.google.cloud."
          + "aiplatform.v1.PipelineTaskDetail.Artifac"
          + "tList:\0028\001\"\246\001\n\005State\022\025\n\021STATE_UNSPECIFIED"
          + "\020\000\022\013\n\007PENDING\020\001\022\013\n\007RUNNING\020\002\022\r\n\tSUCCEEDE"
          + "D\020\003\022\022\n\016CANCEL_PENDING\020\004\022\016\n\nCANCELLING\020\005\022"
          + "\r\n\tCANCELLED\020\006\022\n\n\006FAILED\020\007\022\013\n\007SKIPPED\020\010\022"
          + "\021\n\rNOT_TRIGGERED\020\t\"\354\003\n\032PipelineTaskExecu"
          + "torDetail\022g\n\020container_detail\030\001 \001(\0132F.go"
          + "ogle.cloud.aiplatform.v1.PipelineTaskExe"
          + "cutorDetail.ContainerDetailB\003\340A\003H\000\022j\n\021cu"
          + "stom_job_detail\030\002 \001(\0132F.google.cloud.aip"
          + "latform.v1.PipelineTaskExecutorDetail.Cu"
          + "stomJobDetailB\005\030\001\340A\003H\000\032\234\001\n\017ContainerDeta"
          + "il\022=\n\010main_job\030\001 \001(\tB+\340A\003\372A%\n#aiplatform"
          + ".googleapis.com/CustomJob\022J\n\025pre_caching"
          + "_check_job\030\002 \001(\tB+\340A\003\372A%\n#aiplatform.goo"
          + "gleapis.com/CustomJob\032O\n\017CustomJobDetail"
          + "\0228\n\003job\030\001 \001(\tB+\340A\003\372A%\n#aiplatform.google"
          + "apis.com/CustomJob:\002\030\001B\t\n\007detailsB\235\002\n\036co"
          + "m.google.cloud.aiplatform.v1B\010PipelineP\001"
          + "ZDgoogle.golang.org/genproto/googleapis/"
          + "cloud/aiplatform/v1;aiplatform\252\002\032Google."
          + "Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPla"
          + "tform\\V1\352\002\035Google::Cloud::AIPlatform::V1"
          + "\352AN\n\036compute.googleapis.com/Network\022,pro"
          + "jects/{project}/global/networks/{network"
          + "}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ArtifactProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ContextProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ExecutionProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.PipelineFailurePolicyProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.PipelineStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ValueProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "PipelineSpec",
              "State",
              "JobDetail",
              "Error",
              "Labels",
              "RuntimeConfig",
              "EncryptionSpec",
              "ServiceAccount",
              "Network",
              "TemplateUri",
              "TemplateMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor,
            new java.lang.String[] {
              "Parameters", "GcsOutputDirectory", "ParameterValues", "FailurePolicy",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParametersEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParameterValuesEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParameterValuesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParameterValuesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineJob_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTemplateMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_PipelineTemplateMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTemplateMetadata_descriptor,
            new java.lang.String[] {
              "Version",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJobDetail_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_PipelineJobDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJobDetail_descriptor,
            new java.lang.String[] {
              "PipelineContext", "PipelineRunContext", "TaskDetails",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor,
            new java.lang.String[] {
              "TaskId",
              "ParentTaskId",
              "TaskName",
              "CreateTime",
              "StartTime",
              "EndTime",
              "ExecutorDetail",
              "State",
              "Execution",
              "Error",
              "PipelineTaskStatus",
              "Inputs",
              "Outputs",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_PipelineTaskStatus_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_PipelineTaskStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_PipelineTaskStatus_descriptor,
            new java.lang.String[] {
              "UpdateTime", "State", "Error",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_ArtifactList_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_ArtifactList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_ArtifactList_descriptor,
            new java.lang.String[] {
              "Artifacts",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_InputsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_InputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_InputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_OutputsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_OutputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_OutputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_descriptor,
            new java.lang.String[] {
              "ContainerDetail", "CustomJobDetail", "Details",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_ContainerDetail_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_ContainerDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_ContainerDetail_descriptor,
            new java.lang.String[] {
              "MainJob", "PreCachingCheckJob",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_CustomJobDetail_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_CustomJobDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_CustomJobDetail_descriptor,
            new java.lang.String[] {
              "Job",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ArtifactProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ContextProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExecutionProto.getDescriptor();
    com.google.cloud.aiplatform.v1.PipelineFailurePolicyProto.getDescriptor();
    com.google.cloud.aiplatform.v1.PipelineStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ValueProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
