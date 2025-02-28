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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_text_extraction.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public final class AutoMLTextExtractionProto {
  private AutoMLTextExtractionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextExtraction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextExtraction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextExtractionInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextExtractionInputs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nZgoogle/cloud/aiplatform/v1beta1/schema"
          + "/trainingjob/definition/automl_text_extr"
          + "action.proto\022=google.cloud.aiplatform.v1"
          + "beta1.schema.trainingjob.definition\032\034goo"
          + "gle/api/annotations.proto\"\201\001\n\024AutoMlText"
          + "Extraction\022i\n\006inputs\030\001 \001(\0132Y.google.clou"
          + "d.aiplatform.v1beta1.schema.trainingjob."
          + "definition.AutoMlTextExtractionInputs\"\034\n"
          + "\032AutoMlTextExtractionInputsB\217\003\nAcom.goog"
          + "le.cloud.aiplatform.v1beta1.schema.train"
          + "ingjob.definitionB\031AutoMLTextExtractionP"
          + "rotoP\001Zggoogle.golang.org/genproto/googl"
          + "eapis/cloud/aiplatform/v1beta1/schema/tr"
          + "ainingjob/definition;definition\252\002=Google"
          + ".Cloud.AIPlatform.V1Beta1.Schema.Trainin"
          + "gJob.Definition\312\002=Google\\Cloud\\AIPlatfor"
          + "m\\V1beta1\\Schema\\TrainingJob\\Definition\352"
          + "\002CGoogle::Cloud::AIPlatform::V1beta1::Sc"
          + "hema::TrainingJob::Definitionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextExtraction_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextExtraction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextExtraction_descriptor,
            new java.lang.String[] {
              "Inputs",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextExtractionInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextExtractionInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextExtractionInputs_descriptor,
            new java.lang.String[] {});
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
