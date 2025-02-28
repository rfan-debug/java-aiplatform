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
// source: google/cloud/aiplatform/v1beta1/schema/predict/instance/image_segmentation.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.instance;

public final class ImageSegmentationPredictionInstanceProto {
  private ImageSegmentationPredictionInstanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_ImageSegmentationPredictionInstance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_ImageSegmentationPredictionInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nPgoogle/cloud/aiplatform/v1beta1/schema"
          + "/predict/instance/image_segmentation.pro"
          + "to\0227google.cloud.aiplatform.v1beta1.sche"
          + "ma.predict.instance\032\034google/api/annotati"
          + "ons.proto\"I\n#ImageSegmentationPrediction"
          + "Instance\022\017\n\007content\030\001 \001(\t\022\021\n\tmime_type\030\002"
          + " \001(\tB\376\002\n;com.google.cloud.aiplatform.v1b"
          + "eta1.schema.predict.instanceB(ImageSegme"
          + "ntationPredictionInstanceProtoP\001Z_google"
          + ".golang.org/genproto/googleapis/cloud/ai"
          + "platform/v1beta1/schema/predict/instance"
          + ";instance\252\0027Google.Cloud.AIPlatform.V1Be"
          + "ta1.Schema.Predict.Instance\312\0027Google\\Clo"
          + "ud\\AIPlatform\\V1beta1\\Schema\\Predict\\Ins"
          + "tance\352\002=Google::Cloud::AIPlatform::V1bet"
          + "a1::Schema::Predict::Instanceb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_ImageSegmentationPredictionInstance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_ImageSegmentationPredictionInstance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_ImageSegmentationPredictionInstance_descriptor,
            new java.lang.String[] {
              "Content", "MimeType",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
